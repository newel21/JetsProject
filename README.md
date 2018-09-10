## Jets Project

### Week 2 Homework for Skill Distillery

This program displays and manages a fleet of Jet objects.

The user will be prompted with the option. The program will run depending on the user's option.

All the Methods are in the AirField Class, and these method called in the JetApp Class.

So when user choose option 1, the listJets() in AirField Class is called and executed which basically list whatever is in the Array.

Option 2 calls the flyAll() which also list the objects inside the Array plus a calculation of timeLeft = range/speed.

Option 3 calls the listFastest() in which it iterates through the loop to find the object that has the biggest  speed number then prints it out.

Option 4 calls the longestRange() which has the same logic as listFastest() but is looking for the largest range number

Option 5 calls the loadingCargoNow(), iterates through the loop and looks for the object(s) that implements CargoCarrier interface, then prints it out.

Option 6 calls for the dogFight() which has the same logic with loadingCargoNow() but looks for the CombatReady interface.

Option 7 is the hardest part, at least for me. I think that the program is about 95% complete because I'm having trouble with this part. Although I was able to store the user input to the existing Array.

Option 8 just ends the program.