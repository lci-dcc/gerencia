package br.ufrj.dcc.gerencia.domain.base;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by fausto on 4/5/16.
 */
public abstract class LciLdapSpecification extends LciSpecification{

  @Override
  public Object toSpecification() {
    throw new NotImplementedException();
  }
  
}