
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
