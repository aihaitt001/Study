/**   
 * Copyright © 2018 www.lifeforfun.cn. All rights reserved.
 * 
 * @Package: util.Tree 
 * @author: ovo   
 * @date: 2018年8月24日 上午10:20:14 
 */
package util.Tree;

/**
 * @ClassName: Node
 * @Description: TODO 树的节点类
 * @author: ovo
 * @date: 2018年8月24日 上午10:20:14
 */
public class Node {
	String ele = "node";

	private Node fChild;
	private Node nSibling;

	public void setEle(String ele) {
		this.ele = ele;
	}

	public String getEle() {
		return this.ele;
	}

	public void setfChild(Node fchild) {
		this.fChild = fchild;
	}

	public Node getfChild() {
		return fChild;
	}

	public void setnSibling(Node nSibling) {
		this.nSibling = nSibling;
	}

	public Node getnSibling() {
		return nSibling;
	}
}
