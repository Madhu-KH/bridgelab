package com.DayOne;

public class BinarySearchTree {
	//a node in BST
	public static class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public Node root;//represents root of binary tree
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int data) {
		Node newnode=new Node(data);
		if(root==null) {
			root=newnode;
			return;
		}
		else {
			Node current=root,parent=null;
			
			while(true) {
				parent=current;
				
				if(data<current.data) {
					current=current.left;
					if(current==null) {
						parent.left=newnode;
						return;
					}
				}
				else {
					current=current.right;
					if(current==null) {
						parent.right=newnode;
						return;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();  
        //Add nodes to the binary tree  
        bt.insert(50);  
        bt.insert(30);  
        bt.insert(70);  
        bt.insert(60);  
        bt.insert(10);  
        bt.insert(90);  

        System.out.print("Binary search tree after insertion:"+bt);  

	}

}
