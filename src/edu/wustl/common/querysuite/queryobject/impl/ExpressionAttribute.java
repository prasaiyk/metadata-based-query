package edu.wustl.common.querysuite.queryobject.impl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.common.dynamicextensions.domaininterface.AttributeInterface;
import edu.wustl.cab2b.common.cache.AbstractEntityCache;
import edu.wustl.common.querysuite.queryobject.IExpression;
import edu.wustl.common.querysuite.queryobject.IExpressionAttribute;
import edu.wustl.common.querysuite.queryobject.TermType;

public class ExpressionAttribute extends ArithmeticOperand implements IExpressionAttribute {
    private static final long serialVersionUID = 2376055279144184693L;

    private IExpression expression;

    private transient AttributeInterface attribute;

    ExpressionAttribute() {
    // for hibernate
    }

    public ExpressionAttribute(IExpression expression, AttributeInterface attribute, TermType termType) {
        setExpression(expression);
        setAttribute(attribute);
        setTermType(termType);
    }

    @Override
    public void setTermType(TermType termType) {
        super.setTermType(termType);
    }

    public AttributeInterface getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeInterface attribute) {
        if (attribute == null) {
            throw new NullPointerException();
        }
        this.attribute = attribute;
    }

    public IExpression getExpression() {
        return expression;
    }

    public void setExpression(IExpression expression) {
        if (expression == null) {
            throw new NullPointerException();
        }
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExprId: " + expression.getExpressionId() + ", Attribute: " + attribute;
    }
    
    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeObject(attribute.getId());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        Long id = (Long) s.readObject();
        attribute = AbstractEntityCache.getCache().getAttributeById(id);
    }
}
