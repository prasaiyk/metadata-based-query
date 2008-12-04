package edu.wustl.common.querysuite.queryobject;


/**
 * @author vijay_pande
 * Interface for Composite Query
 */
public interface ICompositeQuery
{
	/**
	 * Method to return operation associated with the Composite query
	 * @return operation Object of type IOperation
	 */
	public IOperation getOperation();
}