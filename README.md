Pentru Administrator
GET/customers, GET/productPage, GET/customer/{username}
POST/registerAdmin

Pentru Customer
GET/listProducts
POST/registerCustomer

Index page
GET/customerRegistration, GET/adminRegistration, GET/ - afiseaza index 

Pentru Product cand este folosit de pe Admin
GET/products
POST/addProduct

http://localhost:8080
Afiseaza link catre 'Customer registration' si link catre 'Administrator registration'
1. Daca se alege "Go to 'Customer Registration' Page", se deschide pagina http://localhost:8080/customerRegistration in care se pot introduce 3 field-uri First Name, Last Name si Username.
   Butonul de Save va salva in baza de date noul customer si se va afisa pagina http://localhost:8080/registerCustomer cu informatii si 2 linkuri: Go to index Page si See 'Products list'
   Pentru ca inca nu au fost adaugate produse selectand See 'Products list' se va afisa pagina http://localhost:8080/listProducts in care apare scris No products
   Atunci cand sunt produse se vor afisa intr-un tabel produsele. Din aceasta pagina se poate merge la index page prin linkul Index Page
2. Daca se alege "Go to 'Administrator Registration' Page", se deschide pagina http://localhost:8080/adminRegistration in care se pot introduce 3 field-uri First Name, Last Name si Username.
   Butonul de Save va salva in baza de date noul customer si se va afisa pagina http://localhost:8080/registerAdmin cu informatii si 4 linkuri: Go to index Page, See 'Customers list', See 'Products list' si See 'Add Product Page'
   Daca se alege Go to index Page se revine la pagina principala
   Daca se alege See 'Customers list' se va deschide pagina http://localhost:8080/customers in care se va afisa lista cu customerii daca exista, altfel No costumers
   Daca se alege See 'Products list' se va afisa pagina http://localhost:8080/products in care apare scris No products daca nu sunt produse sau daca exista lista de produse intr-un tabel. In aceasta pagina sunt 2 linkuri:
   See 'Add Product Page' si Go to index Page.
   Daca se alege See 'Add Product Page' se va afisa http://localhost:8080/productPage in care se pot introduce 3 field-uri Product Name, Product Description si Price.
   Butonul de Save va salva in baza de date noul customer si se va afisa pagina http://localhost:8080/products cu informatii si 2 linkuri: See 'Add Product Page' si Go to index Page

   Adminul poate are optiunea sa afiseze si informatiile unui customer gasit dupa username folosind http://localhost:8080/customer/ana
   Daca nu exista se va afisa No customer found
   Daca exista se vor afisa informatiile
   Aceasta pagina are si un link See 'Customers list' ce va afisa lista customer-ilor

   Din pacate nu am reusit sa implementez ce am gandit la inceput. Am acoperit minimul cerut GET si POST cu Repository, Service si baza de date

   Baza de date este onlinestore
   In application.properties:
   spring.h2.console.enabled=true
   spring.datasource.generate-unique-name=false
   spring.datasource.name=onlinestore

   In schema.sql si data.sql sunt crearea tabelelor si insertul a 3 produse (care se pare ca nu merge decat manual din consola h2)

   
