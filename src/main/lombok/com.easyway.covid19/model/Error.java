package com.easyway.covid19.model;


	import org.jvnet.jaxb2_commons.lang.CopyStrategy;
	import org.jvnet.jaxb2_commons.lang.CopyTo;
	import org.jvnet.jaxb2_commons.lang.Equals;
	import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
	import org.jvnet.jaxb2_commons.lang.HashCode;
	import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
	import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
	import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
	import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
	import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
	import org.jvnet.jaxb2_commons.lang.ToString;
	import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
	import org.jvnet.jaxb2_commons.locator.ObjectLocator;
	import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlSchemaType;
	import javax.xml.bind.annotation.XmlType;
	import java.util.ArrayList;
	import java.util.List;


	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "Error", propOrder = {
	    "code",
	    "message",
	    "transactionId",
	    "timestamp"
	})
	public class Error
	    implements Cloneable, CopyTo, Equals, HashCode, ToString
	{

	    @XmlElement(name = "Code", required = true)
	    @XmlSchemaType(name = "string")
	    protected ErrorCodeEnum code;
	    @XmlElement(name = "Message", required = true)
	    protected List<String> message;
	    @XmlElement(name = "TransactionId")
	    protected String transactionId;
	    @XmlElement(name = "Timestamp")
	    protected long timestamp;

	    public ErrorCodeEnum getCode() {
	        return code;
	    }

	    public void setCode(ErrorCodeEnum value) {
	        this.code = value;
	    }

	    public List<String> getMessage() {
	        if (message == null) {
	            message = new ArrayList<String>();
	        }
	        return this.message;
	    }

	    public String getTransactionId() {
	        return transactionId;
	    }


	    public void setTransactionId(String value) {
	        this.transactionId = value;
	    }

	    public long getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(long value) {
	        this.timestamp = value;
	    }

	    public String toString() {
	        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
	        final StringBuilder buffer = new StringBuilder();
	        append(null, buffer, strategy);
	        return buffer.toString();
	    }

	    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
	        strategy.appendStart(locator, this, buffer);
	        appendFields(locator, buffer, strategy);
	        strategy.appendEnd(locator, this, buffer);
	        return buffer;
	    }

	    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
	        {
	            ErrorCodeEnum theCode;
	            theCode = this.getCode();
	            strategy.appendField(locator, this, "code", buffer, theCode);
	        }
	        {
	            List<String> theMessage;
	            theMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
	            strategy.appendField(locator, this, "message", buffer, theMessage);
	        }
	        {
	            String theTransactionId;
	            theTransactionId = this.getTransactionId();
	            strategy.appendField(locator, this, "transactionId", buffer, theTransactionId);
	        }
	        {
	            long theTimestamp;
	            theTimestamp = this.getTimestamp();
	            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp);
	        }
	        return buffer;
	    }

	    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
	        if (!(object instanceof Error)) {
	            return false;
	        }
	        if (this == object) {
	            return true;
	        }
	        final Error that = ((Error) object);
	        {
	            ErrorCodeEnum lhsCode;
	            lhsCode = this.getCode();
	            ErrorCodeEnum rhsCode;
	            rhsCode = that.getCode();
	            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
	                return false;
	            }
	        }
	        {
	            List<String> lhsMessage;
	            lhsMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
	            List<String> rhsMessage;
	            rhsMessage = (((that.message!= null)&&(!that.message.isEmpty()))?that.getMessage():null);
	            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
	                return false;
	            }
	        }
	        {
	            String lhsTransactionId;
	            lhsTransactionId = this.getTransactionId();
	            String rhsTransactionId;
	            rhsTransactionId = that.getTransactionId();
	            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionId", lhsTransactionId), LocatorUtils.property(thatLocator, "transactionId", rhsTransactionId), lhsTransactionId, rhsTransactionId)) {
	                return false;
	            }
	        }
	        {
	            long lhsTimestamp;
	            lhsTimestamp = this.getTimestamp();
	            long rhsTimestamp;
	            rhsTimestamp = that.getTimestamp();
	            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public boolean equals(Object object) {
	        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
	        return equals(null, null, object, strategy);
	    }

	    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
	        int currentHashCode = 1;
	        {
	            ErrorCodeEnum theCode;
	            theCode = this.getCode();
	            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
	        }
	        {
	            List<String> theMessage;
	            theMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
	            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
	        }
	        {
	            String theTransactionId;
	            theTransactionId = this.getTransactionId();
	            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionId", theTransactionId), currentHashCode, theTransactionId);
	        }
	        {
	            long theTimestamp;
	            theTimestamp = this.getTimestamp();
	            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timestamp", theTimestamp), currentHashCode, theTimestamp);
	        }
	        return currentHashCode;
	    }

	    public int hashCode() {
	        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
	        return this.hashCode(null, strategy);
	    }

	    public Object clone() {
	        return copyTo(createNewInstance());
	    }

	    public Object copyTo(Object target) {
	        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
	        return copyTo(null, target, strategy);
	    }

	    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
	        final Object draftCopy = ((target == null)?createNewInstance():target);
	        if (draftCopy instanceof Error) {
	            final Error copy = ((Error) draftCopy);
	            if (this.code!= null) {
	                ErrorCodeEnum sourceCode;
	                sourceCode = this.getCode();
	                ErrorCodeEnum copyCode = ((ErrorCodeEnum) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
	                copy.setCode(copyCode);
	            } else {
	                copy.code = null;
	            }
	            if ((this.message!= null)&&(!this.message.isEmpty())) {
	                List<String> sourceMessage;
	                sourceMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
	                @SuppressWarnings("unchecked")
	                List<String> copyMessage = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage));
	                copy.message = null;
	                if (copyMessage!= null) {
	                    List<String> uniqueMessagel = copy.getMessage();
	                    uniqueMessagel.addAll(copyMessage);
	                }
	            } else {
	                copy.message = null;
	            }
	            if (this.transactionId!= null) {
	                String sourceTransactionId;
	                sourceTransactionId = this.getTransactionId();
	                String copyTransactionId = ((String) strategy.copy(LocatorUtils.property(locator, "transactionId", sourceTransactionId), sourceTransactionId));
	                copy.setTransactionId(copyTransactionId);
	            } else {
	                copy.transactionId = null;
	            }
	            {
	                long sourceTimestamp;
	                sourceTimestamp = this.getTimestamp();
	                long copyTimestamp = strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp);
	                copy.setTimestamp(copyTimestamp);
	            }
	        }
	        return draftCopy;
	    }

	    public Object createNewInstance() {
	        return new Error();
	    }

	    public void setMessage(List<String> value) {
	        this.message = null;
	        List<String> draftl = this.getMessage();
	        draftl.addAll(value);
	    }

	}

