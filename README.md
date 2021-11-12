# Acebook - JavaCakes

Link to Application : https://acebook-javacakes.herokuapp.com/login

The application uses:
  - `maven` to build the project
  - `thymeleaf` for templating
  - `flyway` to manage `postgres` db migrations
  - `selenium` for feature testing
  - `faker` to generate fake names for testing
  - `junit4` for unit testing
  - `spring-security` for authentication and user management
  
Below, you'll find specific learning objectives for each tool.

## QuickStart Instructions 

- Fork and clone this repository to your machine
- Open the codebase in an IDE like InteliJ or VSCode
- Create a new Postgres database called `acebook_springboot_development`
- Install Maven `brew install maven`
- Build the app and start the server, using the Maven command `mvn spring-boot:run`
> The database migrations will run automatically at this point
- Visit `http://localhost:8080/users/new` to sign up

## User Stories
```
As a user, 
So that I can log in and post on Acebook, 
I would like to be able to sign up.
```
```
As a user, 
So that I can post on Acebook, 
I would like to be able to sign in.
```
```
As a user, 
So that I can share what I want, 
I would like to be able to make a post.
```
```
As a user, 
So that I can leave acebook, 
I would like to sign out.
```
```
As a user, 
So that I can show who I am,  
I would like to add a profile picture to my account.
```
```
As a user, 
So that I can share images, 
I would like to be able to post a picture. 
```
```
As a user, 
So that I can share my opinions on the posts, 
I would like to be able to make a comment.
```
```
As a user, 
So that I can remove a post I don’t want, 
I would like to be able to delete a post.
```
```
As a user, 
So that I can remove a comment I don’t want, 
I would like to be able to delete a comment.
```
```
As a user, 
So that I can see all my posts, 
I would like to have a profile page.
```
```
As a user, 
So that I can show what posts I like, 
I would like to be able to like posts.
```

## Mock-up of inherited codebase
![Original mockup](https://user-images.githubusercontent.com/80968551/141469609-497165fb-2424-48f2-aeb3-f9a5299050e5.png)

## Application mock-up

![New mockup-6](https://user-images.githubusercontent.com/80968551/141471140-823b9501-0eef-4b1f-a3c6-844b5d32a386.png)



## Existing features

This app already has a few basic features
* A user can sign up at `/users/new`
* A signed up user can sign in at `/login`
* A signed in user can create posts at `/posts`
* A signed in user can sign out at `/logout`

## Added features
### MVP
* A user can add a profile picture 
* A user can post a picture
* A user can comment on a post
* A user can delete a post
* A user can delete a comment 
* A user can see their profile page

### Added functionality
* A user can like posts
* A user can edit posts




