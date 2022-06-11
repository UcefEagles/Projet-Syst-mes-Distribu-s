# Projet-Syst-mes-Distribu-s
Projet:un système distribué basé sur les micro-services permettant de gérer les factures  des clients.

Les microservices désignent à la fois une architecture et une approche de développement logiciel qui consiste à décomposer les applications en éléments les plus simples, indépendants les uns des autres. 

1/-Customer-service:

        dans ce service j'ai crée une classe customer dans les attributs porte l'id , le nom et l'email de client ,puis j'ai crée un interface CustomersRepository pour ajouter les élements dans base de données. voici la liste des consomateur 

Affichage des Clients:

![image](https://user-images.githubusercontent.com/97621443/173165511-97c4522a-42da-4fab-ad40-cab28c3dd16a.png)



Affichage d'un client:
  
![image](https://user-images.githubusercontent.com/97621443/173165958-01f04a33-6b6b-4033-ae44-50e9bb111e90.png)

L'affichage en utilisant projection:

![image](https://user-images.githubusercontent.com/97621443/173165990-5fd8ad1b-e401-4506-b853-0b89fa9c9bd0.png)


Le console du DB H2:

![image](https://user-images.githubusercontent.com/97621443/173165710-799140f8-b840-4633-95c1-f0558a603c19.png)



2/-Inventory-service:

 Affichage Des produits:
 
![image](https://user-images.githubusercontent.com/97621443/173165881-1c6cae87-58eb-4761-bc58-7ff31f910c27.png)

Le console du DB H2:

![image](https://user-images.githubusercontent.com/97621443/173166038-7150f4f2-664b-4743-a8d9-fdf1bbe70ad0.png)



3/-Gateway-service:


Le rôle de la passerelle Gateway-service est multiple. Elle permet d'agréger différents microservices mais également de réaliser la transformation de protocoles ou de données ou encore de distribuer ces données sur différents microservices.

                a-Methode Statique Avec Le fichier application.yaml:
                
![image](https://user-images.githubusercontent.com/97621443/173166195-6a42fd77-95ff-4986-815b-b02bbd7a001a.png)
                
                
                b-Methode Dynamique:
                
                
![image](https://user-images.githubusercontent.com/97621443/173166246-8fca7b39-c39b-48b0-a998-cdd783b15b54.png)


  4/ Eureka-Service :
        Eureka de Netflix remplit précisément cette fonction. Une fois en place, les instances des microservices viennent s'enregistrer dans le registre d'Eureka. Pour appeler un microservice, il suffira de piocher dans cette liste d'instances qu'Eureka expose via une API REST.

Eureka offre un client capable de réaliser des opérations de récupération des listes d'instances.(figure 1)


![image](https://user-images.githubusercontent.com/97621443/173166421-4cf82231-57d8-4637-a6b3-d764cd08365c.png)


Application.properties :


![image](https://user-images.githubusercontent.com/97621443/173166544-5e20467a-b2ed-455c-a3b7-999851786592.png)


![image](https://user-images.githubusercontent.com/97621443/173166570-49f10a77-9411-49bb-8399-175907832c16.png)

Les micro-services apres en utillisant Eureka:

                CUSTOMER-SERVICE:
                
                
![image](https://user-images.githubusercontent.com/97621443/173166736-3db2cb8d-23e2-4423-9083-e505a0cc30f8.png)


![image](https://user-images.githubusercontent.com/97621443/173166764-046b1d3d-3c40-4026-b345-2e17eb8efad6.png)



               
                INVENTORY-SERVICE:
                
![image](https://user-images.githubusercontent.com/97621443/173166820-b500e8d4-a293-43a2-abdf-005e0ba0c375.png)


![image](https://user-images.githubusercontent.com/97621443/173166833-1666c4ed-d009-49e7-86bc-82249bd68462.png)

                
                
                
                BILLING-SERVICE:
                
                
                


















