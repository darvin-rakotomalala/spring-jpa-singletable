## Spring Data JPA | Single Table

Dans ce repo, nous allons voir un exemple Spring Data JPA inheritance Single Table.

### Single Table

En utilisant le type d'héritage single strategy, vous créez une seule table en tant qu'entité principale. Il ne crée
pas de tableaux séparés pour chaque entité. Nous ajoutons la notation `@DiscriminatorValue` pour distinguer chaque entité.
Si nous ne l'ajoutons pas, Hibernate utilise le nom de l'entité comme valeur distinctive par défaut. Cela nous permet de
créer facilement des requêtes. L'un des inconvénients de cette méthode est que les colonnes inutilisées sont créées dans
une table d'entités et qu'elles prennent des valeurs nulles. Ainsi, aucune définition nulle ne peut être faite.

### Technologies
---

- Java 17
- Spring Boot 3
- Spring Data JPA
- Lombok
- MapStruct
- Maven 3+
- PostgreSQL