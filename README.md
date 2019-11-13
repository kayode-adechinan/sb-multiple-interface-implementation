# Spring Boot multiple interface's implementations

The purpose of this app is to show how to handle multiple interface's implementations by making use of @Qualifier annotation. The app contains three packages.

* The domain package show how to use @Qualifier annotation on domain classes.

* The factory package show how to use @Qualifier annotation to create beans with factory pattern.

* The logic package show how to handle multiple implementations of same logic. So for instance, you have a typical service to save and get items. And a Jpa implementation and an InMemory implementation.

 