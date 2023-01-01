package tp_generics2;

import java.util.List;


public class MetierProduitImpl implements IMetier<Produit> {
	List<Produit> produits;

	  @Override
	  public void add(Produit o) {		   
	            produits.add(o);
	  }	      	 

	public MetierProduitImpl(List<Produit> produits) {
		this.produits = produits;
	}


	@Override
	  public List<Produit> getAll() {
		  if(produits==null) {
			  return null;
		  }
		  
		  return produits;
		  
	  }

	  @Override
	  public Produit findById(long id) {
		  for(Produit p : produits)
			  if(p.getId()==id)
				  return p;			  
	   return  null; //produits.stream().filter(it -> it.getId().equals(id)).findFirst();
	  }

	@Override
	  public void delete(long idprod) {
		 Produit p =findById(idprod);
	     produits.remove(p);	 
			 
	  }
	@Override
	public String toString() {
		return "MetierProduitImpl [produits=" + produits + "]";
	}
    


}
