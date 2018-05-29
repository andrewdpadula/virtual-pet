# Virtual Pet
For each turn, the status of the pet is displayed with each of the 4 attributes
expressed as a number from 0 to 10: Hungry, Thirsty, Sleepy, Unhappy. At the start
of the game, each of these attributes is 5 out of 10.

The command selected on each turn brings one of the attributes down to zero
but raises another by 1. For instance, if the player chooses "Feed", Hungry goes
down to zero, but Sleepy goes up by 1 (because eating food makes the cat sleepy).
For "Give water", Thirsty goes down to zero, but Unhappy increases by 1 (because cats
hate water). If "Put to bed" is selected, Sleepy goes to zero, but Thirsty goes up
by 1 (because the cat becomes dehydrated in its sleep). And if "Play" is selected,
Unhappy goes down to zero, but Hungry increases by 1 (because burning calories
works up the cat's appetite).

Every time the player selects a command, this constitutes 1 tick. The cat is
fed or given water or put to bed or played with, its attributes are adjusted
accordingly, and the passing of time represented by the tick causes each
of the attributes to increase by 1 (in addition to whatever other changes
were caused. So, for example, when you "Feed" the cat, Hungry goes to zero,
Sleepy goes up by 1, and then all 4 attributes (Hungry, Thirsty, Sleepy, Unhappy)
increase by 1.

If any attribute reaches 10, you lose the game.