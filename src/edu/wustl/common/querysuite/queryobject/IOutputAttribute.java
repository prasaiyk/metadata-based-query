/**
 * 
 */

package edu.wustl.common.querysuite.queryobject;

import edu.wustl.common.querysuite.querableobjectinterface.QueryableAttributeInterface;


/**
 * @author chetan_patil
 * @created Oct 8, 2007, 3:04:09 PM
 */
public interface IOutputAttribute extends IBaseQueryObject, INameable
{

	IExpression getExpression();

	QueryableAttributeInterface getAttribute();

}
