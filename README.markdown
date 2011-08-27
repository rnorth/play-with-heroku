# Basic Play! Framework on Heroku #

This basic project demonstrates use of Play! framework on Heroku, using Heroku's capability to run Play apps (as well as generic Java apps).

This application includes a simple controller and domain model, and uses the Postgres database provided by Heroku to store data.

## Deployment ##

After cloning, to deploy to Heroku:

	$ heroku create --stack cedar
	...
	$ git push heroku master
	...
	$ heroku open

That's it!

## How it works ##

A Procfile sits in the application root folder to trigger Heroku to launch the application in the correct way. It seems Heroku automatically detects the Play nature of the app and downloads the framework into a '.play' folder - as a result it is not necessary to bundle the whole framework with the app.

Some additional configuration elements in application.conf are set, prefixed %heroku, including one to connect to the Postgres database (with a URL provided via the Procfile).