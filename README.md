# IT342_G5_Noay_Lab1

Project description:
	Shopify is an e-commerce web-based application developed to support local businesses by providing a centralized digital platform for online marketing and transactions. The system integrates secure electronic payment processing to ensure efficient, reliable, and seamless financial transactions between buyers and sellers. It features core modules such as product catalog management, order processing, and user account administration to enhance operational efficiency and user experience. The application aims to promote digital transformation among local sellers while providing customers with a convenient, secure, and accessible online shopping environment.

Technologies used:
Backend
* Java 17 (or higher)
* Spring Boot Framework
* Spring Web (REST API)
* Spring Data JPA (Database integration)
* MySQL / PostgreSQL (Relational Database)
* Maven (Build and dependency management)

Frontend
* React.js (Frontend UI)
* Vite (Development and build tool)
* Axios (HTTP client for API requests)
* Tailwind CSS / Bootstrap (Optional for styling)

Other Tools
* Supabase (Database)
* Git (Version control)
* Node.js & npm (Frontend dependencies)

Steps to run backend:

1. Make sure you have Java 17+ and Maven installed.
2. Open your project folder in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. Configure the application.properties (or application.yml) with your database credentials.
Example:
spring.datasource.url=jdbc:mysql://localhost:3306/shopify_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
4. Build the project using Maven: mvn clean install
5. Run the Spring Boot application: mvn spring-boot:run
6. The backend should now be running at: http://localhost:8080

Steps to run web app:
(Vite + React.js)
1. Make sure you have Node.js 18+ and npm installed.
2. Navigate to your frontend project folder.
3. Install dependencies: npm install
4. Start the development server: npm run dev 
5. The frontend application should now be running at a URL like: http://localhost:5173

List of API endpoints:
EndpointMethodDescriptionRequest Body / Parameters/api/auth/registerPOSTRegister a new user{ username, email, password, role }/api/auth/loginPOSTLogin user{ email, password }/api/productsGETGet all productsNone/api/products/{id}GETGet product by IDid in path/api/productsPOSTAdd a new product (Admin/Seller){ name, description, price, imageUrl }/api/products/{id}PUTUpdate product info (Admin/Seller){ name, description, price, imageUrl }/api/products/{id}DELETEDelete a product (Admin/Seller)id in path/api/ordersGETGet all orders (Admin)None/api/ordersPOSTPlace a new order{ userId, productList, totalAmount }/api/orders/{id}PUTUpdate order status (Admin){ status }/api/usersGETGet all users (Admin)None/api/users/{id}GETGet user by IDid in path/api/paymentPOSTProcess payment{ orderId, paymentMethod, amount }
