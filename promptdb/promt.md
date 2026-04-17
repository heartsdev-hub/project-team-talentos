Se tiene que crear tablas:
-usuario
-roles
-deporte

un usuario puede tener muchos roles y un rol puede tener muchos usuarios.
un entrenador puede entrenar muchos deportes y un deporte puede ser entrenado por muchos entrenadores.

el usuario puede tener muchos roles como secreataria,caja o entrenador.
mientras el usuario tenga el rol de entrenador puede entrenar muchos deportes, ojo solo mientras el usuario tenga el rol de entrenador.
pero si digamos que tiene el rol de secreatario entones no podría entrenar.

pero tambien tendra el rol de cliente.

proceso:

ahora digamos que la secretaria va registrar sus datos del cliente: id,nombre,apellido,dni,num_celular,direccion,password,activo,fecha_desactivacion,createdAt,updatedAt.
se va asignar el rol de cliente.

los horarios:

el cliente podrá escoger horarios:

se da clases de lunes a sabados y los horarios son de las 8:00 am hasta las 5:00 pm, los turnos son mañana y tarde
el cliente puede escoger varios deportes para aprender.
pero el deporte tiene que tener su entrenador.
todos los deportes enseñan a la misma hora, osea todos inician a las 8:00 am, pero los deportes osea el horario puede ser de 8:00 am a 9:00 am entonces pero solo puede aprender un deporte en ese horario, no puede aprender varios deportes en el mismo horario, el cliente puede escoger en que turno aprender. entonces son por sesiones:

de lunes a sabado solo puede dar 3 sesiones:
y el minimo para matricularse es de 12 sesiones.
pero cada semana por 3 sesiones puede escoger en que diade la semana puede venir osea va venir 3 veces ya depende del cliente si quiere venir alguno de los dias de lunes a sabado.
y es una sesion por dia y esa sesion puede escoger en la tarde o en la mañana, al escoger su turno el horario de inicio es de 8 am entonces puede asistir en ese horario que cada clase dura 1 hora. de 8 am a 9 am hay otros horaios tambien que incia de 10 am a 11 am, eso depende, en la tarde tambien inicia a la 1pm hasta las 2pm y de 2pm hasta las 3 pm y de 3pm hasta las 4.
ahora el cliente tambien puede faltar algunas de sus sesiones
entonces el cliente puede reprogramar su sesion digamos
que el cliente puede estar en el turno mañana y falta entonces puede recuperar su sesion en la tarde o otro dia de la semana
o tambien puede ser turno tarde y falta y escoger otro dia de la semana.no es obligatorio recupear en la tarde, puede ser otro dia

ahora el entrenador tambien puede faltar, digamos que entrena en la mañana y tarde entonces digamos que falta entonces se le va asignar otro entrenador para que enseñe,

ahora el cliente tambien podría ver su sesiones de que dia le toca, oseaver sus horarios, su asistencia.
y tambien el entrenador va ver que deportes entrena, su horario y su asistencia.
la asistencia se encarga de hacer la secretaria.

ahora para que el cliente pague, puede ser yape, transferencia.

despues de que culmino las 12 sesiones, tambien puede matricularse otras sesiones mas
y ademas se tiene que calcular con el precio 12 sesiones tiene costa y cada sesion tiene un costo pero minimo es matricularse 12. y el cliente puede matricularse otras 12 sesiones.
