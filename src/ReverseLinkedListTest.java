import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {
	LinkedListUtil util;
    @Before
    public void testSetUp(){
    	util = new LinkedListUtil();
    }
	@Test
	public void testWithEmptyLinkedList() {
		assertNull("Output should be null", util.reverseList(null));
	}
	
	@Test
	public void testWithOnlyOneNode() {
		Node head=null;
		head=LinkedListUtilTestHelper.insert(head, 1);
		//This will print 1 --> null
		LinkedListUtilTestHelper.showLinkedList(head);
		//As there is only one node, head will be same even after reversal.
		assertEquals("Both values should be same" ,head,util.reverseList(head));
	}
	
	@Test
	public void testWithMultipleNodes() {
		
		Node head=null;
		for(int i=0;i<6;i++){
		  head=LinkedListUtilTestHelper.insert(head, i);
		}
		//This will print 0 --> 1 --> 2 --> 3 --> 4 --> 5 -->null
		LinkedListUtilTestHelper.showLinkedList(head);
		Node newHead = util.reverseList(head);
		assertNotNull("output should not be null",newHead);
		assertEquals("Head of reversed list should be same as tail of original list",5,newHead.getValue());
	}
	
	@Test
	public void testWithDuplicateNodes() {
		Node head=null;
		for(int i=0;i<3;i++){
		  head=LinkedListUtilTestHelper.insert(head, i);
		  head=LinkedListUtilTestHelper.insert(head, i);
		}
		//This will print 0 --> 0 --> 1 --> 1 --> 2 --> 2 -->null
		LinkedListUtilTestHelper.showLinkedList(head);
		Node newHead = util.reverseList(head);
		assertNotNull("output should not be null",newHead);
		assertEquals("Head of reversed list should be same as tail of original list",2,newHead.getValue());
	}
}
