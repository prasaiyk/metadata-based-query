/*L
 * Copyright Washington University in St. Louis, SemanticBits, Persistent Systems, Krishagni.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/catissue-metadata-based-query/LICENSE.txt for details.
 */

package edu.wustl.common.querysuite.queryobject;

import edu.common.dynamicextensions.domaininterface.AttributeInterface;

/**
 * Represents an attribute in a term. Such an attribute must belong to an
 * existing {@link IExpression}'s entity.
 * 
 * @author srinath_k
 * @see IExpression#getQueryEntity()
 */
public interface IExpressionAttribute extends IArithmeticOperand {
    /**
     * @return the expression from which this attribute is sourced.
     */
    IExpression getExpression();

    void setExpression(IExpression expression);

    /**
     * @return the actual attribute which is used in a term.
     */
    AttributeInterface getAttribute();

    void setAttribute(AttributeInterface attribute);
}
