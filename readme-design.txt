Design Explanation

Game Logic:

  1. ZorkRunner is the main class where everything start after that it call
  2. ZorkGame which initialize the game setting and everything and start the actual game
  3. GameMapGenerator randomly put all the monster and item in each room when the level start
  GameMapGenerator will run every time when a new level start
  4. The GameMapGenerator will create a GameRoom instance will all the room pre-generated by the GameMapGenerator
  5. The GameMap will have a room object a room is represent as a cell in the game world where the 4 sides could be
  connected to the other room or there is no connection to the other room at all
  6. A Room can have two possible Object either a Unit (usually a monster) or a Item that is randomly drop in the room
  if you go in the room and found a monster you need to beat the monster before picking up the item in the room plus the item
  drop from the monster you can choose to fight or escape (you can also write the info command to see the monster you face or
  the item in the room)
  7. Unit will not be call directly you need to call the UnitFactory method to construct the Player or Monster (this will
  initialize all the necessary environment before initializing anything)
    The real item extend the Item abstract method (Monster and Item)
  8. This is the same of ItemFactory where there is two type of item Consumable and Weapon Item
    The real item Weapon and Consumable Item extend Item

Explanation for the Game Logic Design:
The reason there is a ItemFactory and a UnitFactory because we can make the proper initialization for these object
rather than using the constructor basically we take the constructor out from the Unit method and put it back in the
factory since there is a lot of initialization when we make a new unit or when we make a new item.

The reason we have an abstract item and unit object because there can be many type of unit and items in the future
we can add even more units and item by implementing these abstract classes this make the game scalable for more
features in the future.

Other classes is use the break down the huge game process into smaller part to make it easier to code.

Interface Logic:
  1. ZorkGame initialize the game and CommandParser
  2. The ComandParser call the correct command from the command factory
  3. The actual command is it own class that implement the command interface

We decide to use the Command Design pattern because there are a lots of command to progress this help
break down the logic of the different command.

This class is separate from the main game logic this help to encapsulate the problem if there is a problem
with the parser it will not affect the game at all since the command line is the interface the user use to
communicate with the game. It is a huge and integral part it deserve it own class.
  

*Note- the black small arrow represent the flow the big white arrow represent the inheritance of the class
