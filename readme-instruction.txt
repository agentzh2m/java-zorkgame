Playing the MUIC Zork Game

2.1 Commands:
  info
    Display all the info of the game such the current enemy you are fighting and the enemy stats
    your own stats, the items and enemy in your current room display everything
  take {item-name}
    take the item specified if there are multiple item with the same name it will pick the one that
    is earlier in the queue of items (items with the same name is always exactly the same)
  drop {item}
    drop the item specified if there are multiple item with the same name it will drop the one that
    is earlier in the queue of items (items with the same name is always exactly the same)
  use {potion-item}
    use the potion item if it is not a potion item it will reject to use it after use the item
    will be gone you can go out and find more
  go {direction}
    move in north, south, east and west direction in the map if successful tell the room id
    you move it
  attack with {weapon-item}
    attack the monster (at the head of the queue) with your chosen weapon-item if cannot find
    you will not attack. The enemy will also attack you back when you attack.
  help
    display a brief summary of all the commands
  quit
    quit the game, there will be no save progress so be cautious while using this command

2.2 Mechanics:

- The monster will only attack you when you attack them
- You can only kill the monster according to the queue you cannot choose the unit you want to kill first
- You can only pick the items in the room if there is no enemy left otherwise you need to kill them all first
- If you die you will respawn at your initial starting location
- Some items can kill you read the item description at game-story


2.3 Object Properties
Player
    -HP
    -Bag
Enemy
    -HP
    The Boss have special skills
Weapon-Item
    -Special skill and ability