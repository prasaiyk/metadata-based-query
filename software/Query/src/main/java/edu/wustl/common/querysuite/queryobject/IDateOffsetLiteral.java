/*L
 * Copyright Washington University in St. Louis, SemanticBits, Persistent Systems, Krishagni.
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/catissue-metadata-based-query/LICENSE.txt for details.
 */

package edu.wustl.common.querysuite.queryobject;

/**
 * Represents a literal that is to be used as an offset.
 * 
 * @author srinath_k
 * 
 * @see IDateOffset
 * @see ILiteral
 */
public interface IDateOffsetLiteral extends IDateOffset, ILiteral {
    String getOffset();

    void setOffset(String offset);
}
