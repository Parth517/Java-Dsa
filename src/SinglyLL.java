public class SinglyLL {
    private listNode head;

    private static class listNode{
        private int data;
        private listNode next;
        
        public listNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  void display(){
        listNode current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void lenCount(){
        int counter=0;
        listNode temp=head;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        System.out.print(counter);
    }
    public void insertFirst(int data){
        listNode newNode=new listNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertEnd(int data){
        listNode newNode=new listNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        listNode temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertBet(int data,int pos){
        listNode newNode=new listNode(data);
        if(head==null){
            head=newNode;
        }
        listNode temp=head;
        listNode temp2=temp.next;
        int count=0;
        while(count!=pos){
            temp=temp.next;
            temp2=temp2.next;
            count++;
        }
        temp.next=newNode;
        newNode.next=temp2;
    }
    public listNode delFirst(){
        listNode temp=head;
        head=head.next;
        temp=head;
        return temp;
    }
    public listNode delLast(){
        listNode temp=head;
        listNode temp2=null;
        while(temp.next!=null){
            temp2=temp;
            temp=temp.next;
        }
        temp2.next=null;
        return head;
    }
    public listNode delAfter(int pos){
        listNode temp=head;
        listNode temp2=temp.next;
        listNode temp3=null;
        int count=0;
        while(count !=pos){
            temp3=temp;
            temp2=temp2.next;
            temp=temp.next;
            count++;
        }
        temp3.next=temp2;
        return head;
    }
    public static void main(String[] args) {
        SinglyLL sll=new SinglyLL();
        sll.head=new listNode(10);
        listNode second=new listNode(11);
        listNode third=new listNode(22);
        listNode fourth=new listNode(78);
        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.insertFirst(22);
        sll.insertEnd(13);
        sll.insertEnd(45);
        sll.insertBet(107,2);
        sll.delFirst();
        sll.delLast();
        sll.delAfter(2);
        sll.display();
        sll.lenCount();
    }
}
