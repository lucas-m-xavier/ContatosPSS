# ContatosPSS

Caso um contato seja cadastrado com o telefone igual a algum contato do banco, o mesmo é inserido com o estado "Existente"
O banco do heroku foi feito com a propriedade CREATE, para que o mesmo seja reiniciado sempre que resetado

GET -> contatospss.herokuapp.com/

POST -> contatospss.herokuapp.com/

EXEMPLO POST(JSON):
{
	"nome": "Josefino",
	"telefone": "(11)91111-1111"
}