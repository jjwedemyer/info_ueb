class Node {
	// Private  mit def. init.
	//state hat 3 oder mehr werte(noch nicht entschieden).
	private int  state;
	private Node next;
  private Node prev;


	/**
	 * Default empty Node constructor
	 */
	public Node(int s, Node next, Node prev)
	{
		this.state = s;
    this.next = next;
    this.prev = next;
	}
	/**
	* Returns value of state
	* @return
	*/
	public int getState() {
		return state;
	}

	/**
	* Sets new value of state
	* @param
	*/
	public void setState(int state) {
		this.state = state;
	}

	/**
	* Returns value of next
	* @return
	*/
	public Node getNext() {
		return next;
	}

	/**
	* Sets new value of next
	* @param
	*/
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	* Returns value of prev
	* @return
	*/
	public Node getPrev() {
		return prev;
	}

	/**
	* Sets new value of prev
	* @param
	*/
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
