# Customer Management Web Application

A simple CRUD web application for managing customer data, built with Spring Boot and Tailwind CSS.

## Features

- List all customers
- Add new customers
- Edit existing customers
- Delete customers
- Responsive UI with Tailwind CSS

## Technologies Used

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- Thymeleaf
- H2 Database
- Tailwind CSS
- Maven
- Node.js & npm (for Tailwind CSS build)

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- Node.js and npm (automatically installed by Maven)

## Getting Started

### Clone the repository

```bash
git clone https://github.com/hendisantika/customer-web.git
cd customer-web
```

### Build and run the application

```bash
mvn spring-boot:run
```

This will:

1. Install Node.js and npm (if not already installed)
2. Install the required npm packages
3. Build the Tailwind CSS
4. Compile and run the Spring Boot application

### Access the application

Open your browser and navigate to:

```
http://localhost:8080/customers
```

## Development

### Running in development mode

For development with automatic restarts:

```bash
mvn spring-boot:run
```

### Building Tailwind CSS

To rebuild Tailwind CSS manually:

```bash
npm run build:css
```

To watch for changes in CSS:

```bash
npm run watch:css
```

## Database

The application uses an H2 in-memory database. You can access the H2 console at:

```
http://localhost:8080/h2-console
```

Connection details:

- JDBC URL: `jdbc:h2:mem:customerdb`
- Username: `yu71`
- Password: `53cret`

## License

This project is licensed under the MIT License - see the LICENSE file for details.