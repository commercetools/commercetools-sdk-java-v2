package com.commercetools.api.models.me;


import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>When creating B2B Orders, the Customer must have the <code>MyOrderFromCartDraft</code> Permission.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyOrderFromCartDraftImpl implements MyOrderFromCartDraft, ModelBase {

    
    private String id;
    
    
    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyOrderFromCartDraftImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version) {
        this.id = id;
        this.version = version;
    }
    /**
     * create empty instance
     */
    public MyOrderFromCartDraftImpl() {
    }

    /**
     *  <p>Unique identifier of the Cart that initiates an Order creation.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public Long getVersion(){
        return this.version;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyOrderFromCartDraftImpl that = (MyOrderFromCartDraftImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .toHashCode();
    }

}
