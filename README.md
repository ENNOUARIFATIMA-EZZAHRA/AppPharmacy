# AppPharmacy
💊 Pharmacy Product Management API
🧾 Description
Ce projet a pour objectif de développer une REST API en utilisant Spring Boot pour gérer efficacement les produits d’une pharmacie. Cette application permet au fondateur de :

Ajouter de nouveaux produits à la base de données

Modifier les informations des produits existants

Supprimer les produits obsolètes ou non pertinents

Consulter les produits disponibles

🧩 Contexte du projet
Dans le cadre de l'ouverture d'une nouvelle pharmacie, le fondateur est confronté à des difficultés de gestion des stocks. Une API RESTful a été conçue pour répondre à ces besoins, optimisant la recherche, la mise à jour, et le suivi de l'inventaire des produits.

🎯 Objectifs Fonctionnels
En tant que fondateur de la pharmacie, je veux pouvoir :

➕ Ajouter un produit
Saisir le nom, la quantité, le prix, une description.

L’identifiant est généré automatiquement.

Le produit est ensuite affiché dans la liste des produits disponibles.

📝 Modifier un produit
Accéder aux détails d’un produit existant.

Modifier les informations (quantité, prix, description, etc.).

Enregistrer les modifications dans la base de données.

❌ Supprimer un produit
Supprimer un produit obsolète ou non pertinent.

Il ne doit plus apparaître dans la liste des produits.

📋 Consulter les produits
Afficher la liste complète des produits disponibles.

Vérifier rapidement l’état de l’inventaire.

⚙️ Stack Technique
Spring Boot

Spring Data JPA

Hibernate

MySQL ou PostgreSQL

Lombok

Postman pour les tests

📂 Structure du projet
css
Copier le code
src/
├── main/
│   ├── java/
│   │   └── com.example.pharmacy
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── PharmacyApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql (optionnel pour tests)
└── test/
📌 Livrables
📌 Lien vers la planification des tâches : Trello/Jira

📌 Lien vers la collection Postman : Postman Collection

📌 Lien du repository GitHub : GitHub Repository

✅ Critères de performance
🔹 Toutes les fonctionnalités CRUD sont implémentées.

🔹 Utilisation des technologies : Spring Boot, Spring Data JPA, Lombok.

🔹 Gestion des exceptions globales et spécifiques.

🔹 Tests fonctionnels réalisés avec Postman.

🔹 Livraison dans les délais impartis.
*****************************************
Voici comment tester ton API Spring Boot avec Postman, étape par étape en français, en utilisant les routes que tu as données :
*créer une base de donnes dans my sql
✅ 1. Ouvrir Postman
Assure-toi que :

Ton projet Spring Boot est en cours d'exécution (commande : mvn spring-boot:run).

L’URL de base est http://localhost:8080.

✅ 2. Créer un produit (POST)
Méthode : POST

URL : http://localhost:8080/api/product

Onglet : Body

Choisir : raw → puis JSON (à droite)

Exemple de contenu JSON :

json
Copier
Modifier
{
  "name_article": "Doliprane",
  "description": "Paracétamol 1000mg",
  "prix": 25.0,
  "quantite": 150
}
Clique sur Send

✅ 3. Récupérer tous les produits (GET)
Méthode : GET

URL : http://localhost:8080/api/product

Clique sur Send

Tu verras la liste des produits ajoutés.

✅ 4. Récupérer un produit par ID (GET)
Méthode : GET

URL : http://localhost:8080/api/product

Clique sur Send

✅ 5. Modifier un produit (PUT)
Méthode : PUT

URL : http://localhost:8080/api/product/1(changer 1 ...par l’ID que tu veux tester choises les produits dans mysql)

Onglet : Body > raw > JSON

Contenu JSON :

json
Copier
Modifier
{
  "name_article": "Doliprane Updated",
  "description": "Paracétamol 1000mg",
  "prix": 30.0,
  "quantite": 200
}
Clique sur Send

✅ 6. Supprimer un produit (DELETE)
Méthode : DELETE

URL : http://localhost:8080/api/product/1 (changer 1 ... par l’ID que tu veux tester choises les produits dans mysql)

Clique sur Send
*********************************


#Lien de collection des tests des API avec Postman:
https://.postman.co/workspace/My-Workspace~2be7e78b-294c-4e8d-8fab-bf07529f7a9c/collection/44577571-468e67a4-20af-43eb-9bea-12287d965d64?action=share&creator=44577571
