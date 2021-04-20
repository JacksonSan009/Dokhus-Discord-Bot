
![logo](assets/logo.png)

# Dokhu's discord bot

Dokhu's Bot it made with the purpose to help us to make list of things, like
movies, series, etc. 

Who can work locally in ours machines, so it's not need to
execute it in a dedicated server, but it will work also on a server. 

### How it works?
Create a local text archive where the info is save it. 

### Can i invite it to my server?
yeah, the bot is working right now in [Keroku](https://dashboard.heroku.com/) 
server, so is enable to invite with this 
[link](https://discord.com/api/oauth2/authorize?client_id=802197647645605938&scope=bot&permissions=0)  


#### Project status: In progress.

## Features
### Done

### To do
* Save lists in text archives.
* Can covert data into CSV archive for portability in LetterBox.
* Show an image and description of the movie.
* Be able to use a Google Doc as text archive to save info.
* Find folders in Spanish OS.
* Let able to sincronice same list from different local computers.

##### Trello board: https://trello.com/b/2vqX0B5I/dokhus-discord-bot

## Configuration
The next is required if you want to run it by yourself, otherwise
wouldn't be needed, because you can invite the bot to your server. 

1. Download the project and make it sure all modules and library's are charged 
by **Maven**.

2. Go to [GitHub Developers Portal](https://discord.com/developers/applications)
and create a bot.

3. In **Settings** > **Bot** you will find the **Token**. Copy it.

    ![Token](assets/Token-bottom.png)

3. Go to **.Env** archive, where you are gonna find the system environment variable 
**DISCORD_BOT_TOKEN** where is save it the token. You have to paste the token from 
the bot before copied.

4. Now you can invite your bot to your server, and run it in your machine.

## Commands
in progress.

## Technologies and Library's
* [Dotenv 2.2.0](https://github.com/cdimascio/dotenv-java)
* JUnit 5.7.1
* Java 1.8
* [JavaCord 3.3.0](https://github.com/Javacord/Javacord)
* Maven 4
* [Mockito 3.9.0](https://site.mockito.org/)