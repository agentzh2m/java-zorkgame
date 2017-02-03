2.1 Commands:
  info
  take {item}
  drop {item}
  use {potion-item}
  go {direction}
  attack with {weapon-item}
  help
  quit

2.2 Items
-Weapon
  - White Board Marker (2 dmg 100% accuracy)
    - action: stab
  - iPad (10 dmg 80% accuracy)
    - action: Islap
  - Samsung Note 7 (20 dmg 85% accuracy)
    - Sbomb
  - Stapler Gun (5 dmg 95% accuracy)
    - shoot
  - Water Gun (1 dmg 100% accuracy have 50% chance to double damage)
    - shoot
- Consumable
  - Coke Light (5HP)
    -drink not that fat
  - Coke Zero (2HP)
    - drink non-fat
  - Coke (+10HP) (if you drink coke zero previously +40HP)
    - drink
  - Namthip Water (Potion +20HP have a 5% chance to die and 50% chance to regenerate to full health

2.3 Characters
*Enemy does not heal up except if the enemy have the heal skill
- Player (can put their own name)
- Enemy (Monster)
  - Mj (Lazer Eyes 15 dmg and Heal +10 HP to self, 100 HP )
  - Bossy (hypnosis reduce 50% accuracy and slap 10 dmg, 100 HP) DropItem -> (IPad, Samsung Note 7, Stapler Gun)
  - John (Teleport move to neighbors blocks, Love Hit 10 dmg ,85 HP) DropItem -> (IPad, Samsung Note 7, Stapler Gun)
  - Pj (Resurrection 50% chance to come back with 50% Health, Slap 10 dmg, 101 HP) DropItem -> (White Board Marker, (40%) Stapler Gun (40%), Other Weapon (20%))
  - Ham Minion's (punch 5 dmg 10HP, 35HP) Drop -> (Consumable 35%, Nothing 60% , 5% Drop any weapon)
  - Tow Minion's (kick 7 dmg 12HP, 35HP) Drop -> (Consumable 50%, Nothing 40%, 10% Drop any weapon)
  - Sea and Ice (Need to rescue the couple from the power the darkness power of cs)
  - Possessed Ice (Last boss before rescuing sea )

2.4 Constraints
- A player can only hold a maximum number of 4 items.
- A player have base Health Point (HP) of 100 points.
- A monster is killed, you gain Experience by 0.1, so your attack will be more powerful by 1.1 times (rounded to closest integer).
- if you kill a minion your exp gain is 0.5 kill a boss you gain 10 pts
- your stat is a multiplier
- You have an extra slot every
- Exp required to level up increases by 2x every level base exp is 10 pts
- When you level up your base attack increases by 1.5 times and your base HP increases by 10


2.5 Level Design

Note- Room only put consumable the only weapon that is lying around is the Stapler Gun and Water Gun
if you die you start the whole level again. 

  Synopsis:

  You are a freshman at MUIC somehow your two best friend Sea and Ice got capture by the Evil boss Majeed which is one of the most
  scariest senior in the whole of CS.


  Level 1 (Welcome to 1409):
  For the first level you are surrounded by Ham's Minion his soul got capture by Majeed
  and Majeed use Ham soul to generate minions to go and rescue you need to beat the poor old PJ the gate keeper that never die
  you will be teleported to the next level immediately

  Level 2 (Data Structure Land)
  In this level you will meet both Ham minion and Tow minion somehow Majeed got hold of the secret relic that generate a stronger
  minion in this level you need to FIND and fight against two boss to advance to the next level which is a senior gatekeeper Bossy
  and John when you beat both of the bosses you will be teleport to the next level

  Level 3 (Majeed Secret Lab):
  In this stage MJ resurrect PJ to fight against you furthermore he gave Ice a DisLove potion to fight against you furthermore
  there is only Tow Minion because Ham run out of life force to fight against you. Therefore you need to beat Infected Ice to
  beat the evil MJ after you beat MJ you will be able to rescue Ice and Sea and you Win the game!!!
