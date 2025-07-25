
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>This action generates the PaymentMethodInfoInterfaceAccountSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoInterfaceAccountActionImpl
        implements MyPaymentSetMethodInfoInterfaceAccountAction, ModelBase {

    private String action;

    private String interfaceAccount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyPaymentSetMethodInfoInterfaceAccountActionImpl(@JsonProperty("interfaceAccount") final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
        this.action = SET_METHOD_INFO_INTERFACE_ACCOUNT;
    }

    /**
     * create empty instance
     */
    public MyPaymentSetMethodInfoInterfaceAccountActionImpl() {
        this.action = SET_METHOD_INFO_INTERFACE_ACCOUNT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New account or instance of the payment interface. If empty, any existing value will be removed.</p>
     */

    public String getInterfaceAccount() {
        return this.interfaceAccount;
    }

    public void setInterfaceAccount(final String interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentSetMethodInfoInterfaceAccountActionImpl that = (MyPaymentSetMethodInfoInterfaceAccountActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(interfaceAccount, that.interfaceAccount)
                .append(action, that.action)
                .append(interfaceAccount, that.interfaceAccount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(interfaceAccount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("interfaceAccount", interfaceAccount)
                .build();
    }

    @Override
    public MyPaymentSetMethodInfoInterfaceAccountAction copyDeep() {
        return MyPaymentSetMethodInfoInterfaceAccountAction.deepCopy(this);
    }
}
