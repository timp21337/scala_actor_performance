An extension of Russel Winder's scala actor test from 
http://www.russel.org.uk:8080/Pi_Quadrature/raw/173/Pi_Scala_Actors.scala
The program calculates pi with varying number of actors. 
I have modified this to plot the result of iterating number of actors from 1 to 32. 

https://github.com/timp21337/scala_actor_performance/blob/master/Oops-installed-git-during-run.png
 shows the graph is sensitive to other activities on the machine

https://github.com/timp21337/scala_actor_performance/blob/master/TimeAgainstActors_2_cores.png
 shows nice performance at 2 actors

https://github.com/timp21337/scala_actor_performance/blob/master/TimeAgainstActors_loaded_2_cores.png
shows confsing lack of improvement with 2 actors.

