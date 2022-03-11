
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>To protect your Azure Function, set its <code>authLevel</code> to <code>function</code> and provide the functions key. The commercetools Platform will set the <code>x-functions-key</code> header. For more information, see the <a href="https://docs.microsoft.com/en-us/azure/azure-functions/functions-bindings-http-webhook#keys">Azure Functions documentation</a>.</p>
*  <p>To protect the secret key from being exposed, remove the code parameter and secret key from the URL. For example, use <code>https://foo.azurewebsites.net/api/bar</code> instead of
*  <code>https://foo.azurewebsites.net/api/bar?code=secret</code>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AzureFunctionsAuthenticationImpl implements AzureFunctionsAuthentication, ModelBase {

    private String type;

    private String key;

    @JsonCreator
    AzureFunctionsAuthenticationImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.type = AZURE_FUNCTIONS;
    }

    public AzureFunctionsAuthenticationImpl() {
        this.type = AZURE_FUNCTIONS;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Partially hidden on retrieval for security reasons.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AzureFunctionsAuthenticationImpl that = (AzureFunctionsAuthenticationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).toHashCode();
    }

}
