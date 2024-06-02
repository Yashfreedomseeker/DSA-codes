/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author Yash
 */
public class stackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack st = new stack();
        st.Stack(5);
        for(int i=0; i<=st.capacity; i++){
            if(st.isFull()){
                for(int j=0; j<=st.capacity; j++){
                    st.pop();
                }
            }
            st.push(i+10);
        }
        
 
        
        
    }
    
}
