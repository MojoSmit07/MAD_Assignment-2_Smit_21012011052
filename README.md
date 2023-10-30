# MAD_Assignment-2_Smit_21012011052

MAD_Assignment-2_Smit_21012011052

This Android app allows users to place drink orders with the following key features:

1. MainActivity:
   - Users enter their name and password.
   - They can initiate an order by clicking a button.
   - The name and password are passed to the `OrderActivity`.

2. OrderActivity:
   - Users select a drink type (Tea or Coffee).
   - Additional options can be chosen, such as type of tea or coffee, and drink additions (lemon, sugar, milk).
   - A dynamic UI adapts based on the selected drink type.
   - Users click "Make Order" to construct and send an order summary to the `BillActivity`.

3. BillActivity:
   - Receives the order summary via an `Intent`.
   - Displays the order details (user's name, password, selected drink, options, and additions) in a list format.

In summary, this app collects user preferences for a drink order, processes the order details, and displays them in a list format for the user's review in the `BillActivity`.

![image](https://github.com/MojoSmit07/MAD_Assignment-2_Smit_21012011052/assets/98140609/51f5e719-9d7a-4da8-a0a1-9e704848579b)

![image](https://github.com/MojoSmit07/MAD_Assignment-2_Smit_21012011052/assets/98140609/67337ef2-13c7-44d1-9752-980441e51fcb)



