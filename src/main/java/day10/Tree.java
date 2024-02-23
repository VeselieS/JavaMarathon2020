package JavaMarathone2020.JavaMarathon2020.src.main.java.day10;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
    }

    public Node findNodeByValue(int value) { // поиск узла по значению
        Node currentNode = root; // начинаем поиск с корневого узла
        while (currentNode.getValue() != value) { // поиск покуда не будет найден элемент или не будут перебраны все
            if (value < currentNode.getValue()) { // движение влево?
                currentNode = currentNode.getLeftNode();
            } else { //движение вправо
                currentNode = currentNode.getRightNode();
            }
            if (currentNode == null) { // если потомка нет,
                return null; // возвращаем null
            }
        }
        return currentNode; // возвращаем найденный элемент
    }

    public void insetNode(int value) {
        Node node = new Node();
        node.setValue(value);
        if (root == null) {
            root = node;
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftNode();
                    if (currentNode == null) {
                        parentNode.setLeftNode(node);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightNode();
                    if (currentNode == null) {
                        parentNode.setRightNode(node);
                        return;
                    }
                }
            }
        }
    }

    public boolean deleteNode(int value) // Удаление узла с заданным ключом
    {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = true;
        while (currentNode.getValue() != value) { // начинаем поиск узла
            parentNode = currentNode;
            if (value < currentNode.getValue()) { // Определяем, нужно ли движение влево?
                isLeftChild = true;
                currentNode = currentNode.getLeftNode();
            }
            else { // или движение вправо?
                isLeftChild = false;
                currentNode = currentNode.getRightNode();
            }
            if (currentNode == null)
                return false; // yзел не найден
        }

        if (currentNode.getLeftNode() == null && currentNode.getRightNode() == null) { // узел просто удаляется, если не имеет потомков
            if (currentNode == root) // если узел - корень, то дерево очищается
                root = null;
            else if (isLeftChild)
                parentNode.setLeftNode(null); // если нет - узел отсоединяется, от родителя
            else
                parentNode.setRightNode(null);
        }
        else if (currentNode.getRightNode() == null) { // узел заменяется левым поддеревом, если правого потомка нет
            if (currentNode == root)
                root = currentNode.getLeftNode();
            else if (isLeftChild)
                parentNode.setLeftNode(currentNode.getLeftNode());
            else
                parentNode.setRightNode(currentNode.getLeftNode());
        }
        else if (currentNode.getLeftNode() == null) { // узел заменяется правым поддеревом, если левого потомка нет
            if (currentNode == root)
                root = currentNode.getRightNode();
            else if (isLeftChild)
                parentNode.setLeftNode(currentNode.getRightNode());
            else
                parentNode.setRightNode(currentNode.getRightNode());
        }
        else { // если есть два потомка, узел заменяется преемником
            Node heir = receiveHeir(currentNode);// поиск преемника для удаляемого узла
            if (currentNode == root)
                root = heir;
            else if (isLeftChild)
                parentNode.setLeftNode(heir);
            else
                parentNode.setRightNode(heir);
        }
        return true; // элемент успешно удалён
    }

    private Node receiveHeir(Node node) {
        Node parentNode = node;
        Node heirNode = node;
        Node currentNode = node.getRightNode(); // Переход к правому потомку
        while (currentNode != null) // Пока остаются левые потомки
        {
            parentNode = heirNode;// потомка задаём как текущий узел
            heirNode = currentNode;
            currentNode = currentNode.getLeftNode(); // переход к левому потомку
        }
        // Если преемник не является
        if (heirNode != node.getRightNode()) // правым потомком,
        { // создать связи между узлами
            parentNode.setLeftNode(heirNode.getRightNode());
            heirNode.setRightNode(node.getRightNode());
        }
        return heirNode;// возвращаем приемника
    }

    public void printTree() { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (!isRowEmpty) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeftNode()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRightNode());
                    if (temp.getLeftNode() != null ||
                            temp.getRightNode() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }
}
