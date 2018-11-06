#coletando dados do teclado
numero = int(input("Quantos numeros você quer ver da sequencia de fibonacci? "))

first = 0
second = 1

if numero <= 1:
	print('{} é um numero muito pequeno para exibir uma sequencia.'.format(numero))
elif numero > 101:
	print('{} é um numero muito alto, seu computador pode ficar lento tentando verificar essa sequencia.'.format(numero))
elif numero == 2:
	print('{} -> {}'.format(first, second))
else:
	print('{} -> {}'.format(first, second),end='')
	numero -= 2
	while numero > 0:
		third = first + second
		print(' -> {}'.format(third),end='')
		first, second = second, third
		numero -=1
	print(' -> Fim')



