public class CadastroFuncionario extends Cadastro {
       private String cpf;
       private String email;

       public CadastroFuncionario(String nome, String cpf, String email) {
              super(nome);
              this.cpf = cpf;
              this.email = email;
            }
      public String getCpf() {
                  return cpf;
            }
      public void setCpf(String cpf) {
                  this.cpf = cpf;
            }
      public String getEmail() {
            return email;
            }
      public void setEmail(String email) {
            this.email = email;
            }

      }

