<h1>NutriMarketAPI</h1>
    <p>NutriMarketAPI es una API REST desarrollada en Java utilizando Spring Boot y JPA. Esta API sirve como conector entre la base de datos y una aplicación web, permitiendo gestionar clientes, productos, carritos personales y el contenido de los carritos.</p>
    <h2>✔️Tecnologías Utilizadas</h2>
    <ul>
        <li>Java</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>MySQL</li>
        <li>Maven</li>
    </ul>
    <h2>Funcionalidades</h2>
    <p>La API proporciona las siguientes funcionalidades:</p>
    <ul>
        <li><strong>Clientes:</strong>
            <ul>
                <li>Crear, leer, actualizar y eliminar información de clientes.</li>
                <li>Autenticación y autorización de clientes.</li>
            </ul>
        </li>
        <li><strong>Productos:</strong>
            <ul>
                <li>Consultar y gestionar productos disponibles.</li>
                <li>Crear, leer, actualizar y eliminar productos.</li>
            </ul>
        </li>
        <li><strong>Carritos Personales:</strong>
            <ul>
                <li>Crear y gestionar carritos de compra para los clientes.</li>
                <li>Añadir y eliminar productos en el carrito.</li>
            </ul>
        </li>
        <li><strong>Contenido de los Carritos:</strong>
            <ul>
                <li>Consultar el contenido del carrito de un cliente.</li>
                <li>Actualizar la cantidad de productos en el carrito.</li>
            </ul>
        </li>
    </ul>
    <h2>Instalación</h2>
    <p>Sigue estos pasos para instalar y ejecutar la API en tu entorno local.</p>
    <h3>Prerrequisitos</h3>
    <ul>
        <li>JDK 8 o superior</li>
        <li>Maven</li>
        <li>MySQL o cualquier base de datos compatible con JPA</li>
    </ul>
    <h3>Clonar el repositorio</h3>
    <pre><code>git clone https://github.com/JonathanRodriguezCruz/NutriMarketAPI.git
cd NutriMarketAPI
</code></pre>
    <h3>Configurar la base de datos</h3>
    <ol>
        <li>Crea una base de datos en MySQL (o en tu base de datos preferida).</li>
        <li>Actualiza el archivo <code>src/main/resources/application.properties</code> con la configuración de tu base de datos:</li>
    </ol>
    <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/nutrimarket
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
</code></pre>
    <h3>Compilar y ejecutar la aplicación</h3>
    <ol>
        <li>Compila la aplicación utilizando Maven:</li>
    </ol>
    <pre><code>mvn clean install
</code></pre>
    <ol start="2">
        <li>Ejecuta la aplicación:</li>
    </ol>
    <pre><code>mvn spring-boot:run
</code></pre>
    <h3>Acceder a la API</h3>
    <p>Una vez que la aplicación se esté ejecutando, puedes acceder a la API en la siguiente URL:</p>
    <p><a href="http://localhost:8080">http://localhost:8080</a></p>
    <h2>Endpoints</h2>
    <p>Aquí hay una lista básica de algunos de los endpoints proporcionados por la API:</p>
    <h3>Clientes</h3>
    <ul>
        <li><code>GET /api/customers</code> - Obtener todos los clientes.</li>
        <li><code>GET /api/customers/{id}</code> - Obtener un cliente por ID.</li>
        <li><code>POST /api/customers</code> - Crear un nuevo cliente.</li>
        <li><code>PUT /api/customers/{id}</code> - Actualizar un cliente existente.</li>
        <li><code>DELETE /api/customers/{id}</code> - Eliminar un cliente.</li>
    </ul>
    <h3>Productos</h3>
    <ul>
        <li><code>GET /api/products</code> - Obtener todos los productos.</li>
        <li><code>GET /api/products/{id}</code> - Obtener un producto por ID.</li>
        <li><code>POST /api/products</code> - Crear un nuevo producto.</li>
        <li><code>PUT /api/products/{id}</code> - Actualizar un producto existente.</li>
        <li><code>DELETE /api/products/{id}</code> - Eliminar un producto.</li>
    </ul>
    <h3>Carritos</h3>
    <ul>
        <li><code>GET /api/carts</code> - Obtener todos los carritos.</li>
        <li><code>GET /api/carts/{id}</code> - Obtener un carrito por ID.</li>
        <li><code>POST /api/carts</code> - Crear un nuevo carrito.</li>
        <li><code>PUT /api/carts/{id}</code> - Actualizar un carrito existente.</li>
        <li><code>DELETE /api/carts/{id}</code> - Eliminar un carrito.</li>
    </ul>
    <h3>Contenido de los Carritos</h3>
    <ul>
        <li><code>GET /api/carts/{id}/items</code> - Obtener el contenido del carrito.</li>
        <li><code>POST /api/carts/{id}/items</code> - Añadir un producto al carrito.</li>
        <li><code>PUT /api/carts/{id}/items/{itemId}</code> - Actualizar la cantidad de un producto en el carrito.</li>
        <li><code>DELETE /api/carts/{id}/items/{itemId}</code> - Eliminar un producto del carrito.</li>
    </ul>
    <h2>Contribuir</h2>
    <p>Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:</p>
    <ol>
        <li>Haz un fork del repositorio.</li>
        <li>Crea una rama para tu nueva funcionalidad (<code>git checkout -b nueva-funcionalidad</code>).</li>
        <li>Realiza tus cambios y haz commit de los mismos (<code>git commit -am 'Añadir nueva funcionalidad'</code>).</li>
        <li>Sube tus cambios a tu fork (<code>git push origin nueva-funcionalidad</code>).</li>
        <li>Crea un nuevo Pull Request.</li>
    </ol>
    <h2>Licencia</h2>
    <p>Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más información.</p>

