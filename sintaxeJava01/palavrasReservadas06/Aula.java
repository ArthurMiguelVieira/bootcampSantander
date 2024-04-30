public class Aula {

    // Palavras reservadas em Java

// Controle de Pacotes
import; // Importa pacotes ou classes para dentro do código
package; // Especifica a que pacote as classes pertencem

// Modificadores de Acesso
public; // Acesso aberto a qualquer classe
private; // Acesso restrito à classe atual
protected; // Acesso permitido às subclasses e classes do mesmo pacote

// Tipos Primitivos
boolean; // Valor indicando verdadeiro ou falso
byte; // Inteiro de 8 bits
char; // Caractere Unicode de 16 bits
double; // Número de ponto flutuante de 64 bits
float; // Número de ponto flutuante de 32 bits
int; // Inteiro de 32 bits
long; // Inteiro de 64 bits
short; // Inteiro de 16 bits
void; // Indica que o método não tem retorno de valor

// Modificadores de Classes, Variáveis ou Métodos
abstract; // Classe ou método que precisa ser implementado por subclasses
class; // Especifica uma classe
extends; // Indica a superclasse que a subclasse está estendendo
final; // Impede a extensão de classes, a sobreposição de métodos ou a reinicialização de variáveis
implements; // Indica as interfaces que uma classe irá implementar
interface; // Especifica uma interface
native; // Indica que um método está escrito em uma linguagem dependente de plataforma, como o C
new; // Instancia um novo objeto, chamando seu construtor
static; // Faz um método ou variável pertencer à classe, ao invés de às instâncias
strictfp; // Usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões
synchronized; // Indica que um método só pode ser acessado por uma thread de cada vez
transient; // Impede a serialização de campos
volatile; // Indica que uma variável pode ser alterada durante o uso de threads

// Controle de Fluxo
break; // Sai do bloco de código em que está
case; // Executa um bloco de código dependendo do teste do switch
continue; // Pula a execução do código que viria após essa linha e vai para a próxima passagem do loop
default; // Executa esse bloco de código caso nenhum dos testes de switch-case seja verdadeiro
do; // Executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente
else; // Executa um bloco de código alternativo caso o teste "if" seja falso
for; // Usado para realizar um loop condicional de um bloco de código
if; // Usado para realizar um teste lógico de verdadeiro ou falso
instanceof; // Determina se um objeto é uma instância de determinada classe, superclasse ou interface
return; // Retorna um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável)
switch; // Indica a variável a ser comparada nas expressões case
while; // Executa um bloco de código repetidamente enquanto a condição for verdadeira

// Tratamento de Erros
assert; // Testa uma expressão condicional para verificar uma suposição do programador
catch; // Declara o bloco de código usado para tratar uma exceção
finally; // Bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção
throw; // Usado para passar uma exceção para o método que o chamou
throws; // Indica que um método pode passar uma exceção para o método que o chamou
try; // Bloco de código que tentará ser executado, mas que pode causar uma exceção

// Variáveis de Referência
super; // Refere-se à superclasse imediata
this; // Refere-se à instância atual do objeto

}