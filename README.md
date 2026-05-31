# Employee Management System - DevOps Project

## Project Overview

This project is a Spring Boot Employee Management System developed to demonstrate a complete DevOps workflow.

The application provides REST APIs to manage employee records and uses MySQL as the backend database.

The project was containerized using Docker, automated using Jenkins CI pipelines, and deployed using Docker Compose on a Linux (WSL2) environment.

---

## Architecture

Developer
↓
Git
↓
GitHub
↓
Jenkins
↓
Compile
↓
Test
↓
Package
↓
Docker Build
↓
Docker Hub Push
↓
WSL Linux Server
↓
Docker Compose
↓
Spring Boot Container
↓
MySQL Container

---

## Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL

### DevOps

* Git
* GitHub
* Jenkins
* Docker
* Docker Compose
* Docker Hub
* WSL2 (Ubuntu Linux)

---

## Features

* Create Employee
* View Employees
* Update Employee
* Delete Employee
* MySQL Database Integration
* RESTful API Architecture

---

## Jenkins Pipeline Stages

1. Compile
2. Test
3. Package
4. Docker Version Check
5. Docker Build
6. Docker Push to Docker Hub

---

## Docker Hub Repository

Repository:

natchathra14/employee-management

---

## Running the Application

### Clone Repository

git clone <your-repository-url>

### Start Containers

docker compose up -d

### Verify Containers

docker ps

### Access API

GET

http://localhost:8080/employees

---

## Sample Response

[{"id":1,"name":"Tom","email":"tom@gmail.com","department":"IT","salary":50000.0,"joiningDate":"2026-05-31"}]

---

## Learning Outcomes

* Git Version Control
* Branching and Merging
* Jenkins CI Pipeline
* Docker Containerization
* Docker Compose Networking
* Docker Hub Integration
* Linux Deployment using WSL2
* Spring Boot + MySQL Integration

---

## Future Enhancements

* Kubernetes Deployment
* AWS EC2 Deployment
* Prometheus Monitoring
* Grafana Dashboards
* Terraform Infrastructure Automation
