/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public interface IFuncionario {
    
    public float calcularcomissao(float val,float porcentagem);
    public void adicionarbonus(float bonus);
    public void trocarsupervisor(Funcionario supervisor);
    
}
