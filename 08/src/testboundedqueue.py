import unittest
from boundedqueue import *


class TestBoundedQueue(unittest.TestCase):

    def testSingleInt_SingleElementQueue(self):
        q = BoundedQueue(1)
        insert_val = 2
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)
        
    def testSingleInt_SingleElementQueue_isEmpty(self):
        q = BoundedQueue(1)
        insert_val = 2
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertTrue(q.is_empty())    
   
        
        
    def testSingleString_SingleElementQueue(self): 
        # we should not need to test string type for other case if this case works
        # neither should we need to check if it is empty
        q = BoundedQueue(1)
        insert_val = "abc"
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)  
        


    def testMultiInt_SingleElementQueue_correctlyPop(self):
        q = BoundedQueue(1)
        insert_val_1 = 3
        insert_val_2 = 7
        q.enqueue(insert_val_1)
        result_val = q.dequeue()
        self.assertEqual(insert_val_1, result_val)
        
    def testMultiInt_SingleElementQueue_isEmpty(self):
        q = BoundedQueue(1)
        insert_val_1 = 3
        insert_val_2 = 7
        q.enqueue(insert_val_1)
        result_val = q.dequeue()
        self.assertTrue(q.is_empty())
            
        

    def testSingleInt_MultiElementQueue(self):
        q = BoundedQueue(6)
        insert_val = 3
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)
            

    def testSingleInt_MultiElementQueue_isEmpty(self):
        q = BoundedQueue(6)
        insert_val = 3
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertTrue(q.is_empty())
            

    def testMultiInt_MultiElementQueue(self):
        q = BoundedQueue(4)
        insert_val_1 = 3
        insert_val_2 = 7
        q.enqueue(insert_val_1)
        q.enqueue(insert_val_2)
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        self.assertTrue(insert_val_1 == result_val_1 and insert_val_2 == result_val_2)
        
        
    def testMultiInt_MultiElementQueue_differentTypes(self):
        q = BoundedQueue(10)
        insert_val_1 = "aaaab"
        insert_val_2 = 19.3
        insert_val_3 = 2
        insert_val_4 = -5
        insert_val_5 = False
        insert_val_6 = [3,2,1]
        q.enqueue(insert_val_1)
        q.enqueue(insert_val_2)
        q.enqueue(insert_val_3)
        q.enqueue(insert_val_4)
        q.enqueue(insert_val_5)
        q.enqueue(insert_val_6)  
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        result_val_3 = q.dequeue()
        result_val_4 = q.dequeue()
        result_val_5 = q.dequeue()
        result_val_6 = q.dequeue()
        result = (insert_val_1 == result_val_1 and insert_val_2 == result_val_2 and insert_val_3 == result_val_3 and  insert_val_4 == result_val_4 and insert_val_5 == result_val_5 and insert_val_6 == result_val_6)
        self.assertTrue(result)
    
    
    
    
    
        
        
    def testMultiInt_MultiElementQueue_isEmpty(self):
        q = BoundedQueue(4)
        insert_val_1 = 3
        insert_val_2 = 7
        q.enqueue(insert_val_1)
        q.enqueue(insert_val_2)
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        self.assertTrue(q.is_empty)        
        
        
        #-----------------------------------------------
        
        
        
        
        
        
        
    def testSingleInt_SingleElementQueue_init(self):
        insert_val = 2
        q = BoundedQueue(1, [insert_val])
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)
        
        
    def testSingleInt_SingleElementQueue_isEmpty_init(self):
        insert_val = 2
        q = BoundedQueue(1, [insert_val])
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)
        self.assertTrue(q.is_empty())    
   
        
        
    def testSingleString_SingleElementQueue_init(self): 
        # we should not need to test string type for other case if this case works
        # neither should we need to check if it is empty
        q = BoundedQueue(1)
        insert_val = "abc"
        q.enqueue(insert_val)
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)  
        


    def testMultiInt_SingleElementQueue_correctlyPop_init(self):
        
        insert_val_1 = 3
        insert_val_2 = 7        
        q = BoundedQueue(1, [insert_val_1, insert_val_2])
        result_val = q.dequeue()
        self.assertEqual(insert_val_1, result_val)
        
    def testMultiInt_SingleElementQueue_isEmpty_init(self):
        insert_val_1 = 3
        insert_val_2 = 7        
        q = BoundedQueue(1, [insert_val_1, insert_val_2])
        result_val = q.dequeue()
        self.assertTrue(q.is_empty())
            
        

    def testSingleInt_MultiElementQueue_init(self):
        insert_val = 3
        q = BoundedQueue(6, [insert_val])
        result_val = q.dequeue()
        self.assertEqual(insert_val, result_val)
            

    def testSingleInt_MultiElementQueue_isEmpty_init(self):
        insert_val = 3
        q = BoundedQueue(6, [insert_val])
        result_val = q.dequeue()
        self.assertTrue(q.is_empty())
            

    def testMultiInt_MultiElementQueue_init(self):
        
        insert_val_1 = 3
        insert_val_2 = 7
        q = BoundedQueue(4,[3, 7])
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        self.assertTrue(insert_val_1 == result_val_1 and insert_val_2 == result_val_2)
        
        
    def testMultiInt_MultiElementQueue_differentTypes_init(self):
        q = BoundedQueue(10)
        insert_val_1 = "aaaab"
        insert_val_2 = 19.3
        insert_val_3 = 2
        insert_val_4 = -5
        insert_val_5 = False
        insert_val_6 = [3,2,1]
        q = BoundedQueue(10, [insert_val_1, insert_val_2, insert_val_3, insert_val_4, insert_val_5, insert_val_6])
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        result_val_3 = q.dequeue()
        result_val_4 = q.dequeue()
        result_val_5 = q.dequeue()
        result_val_6 = q.dequeue()
        result = (insert_val_1 == result_val_1 and insert_val_2 == result_val_2 and insert_val_3 == result_val_3 and  insert_val_4 == result_val_4 and insert_val_5 == result_val_5 and insert_val_6 == result_val_6)
        self.assertTrue(result)
    
    
    
    
    
        
        
    def testMultiInt_MultiElementQueue_isEmpty(self):
        q = BoundedQueue(4)
        insert_val_1 = 3
        insert_val_2 = 7
        q.enqueue(insert_val_1)
        q.enqueue(insert_val_2)
        result_val_1 = q.dequeue()
        result_val_2 = q.dequeue()
        self.assertTrue(q.is_empty)        
        
              
        
        
        



if __name__ == '__main__':
    unittest.main(exit=False)
