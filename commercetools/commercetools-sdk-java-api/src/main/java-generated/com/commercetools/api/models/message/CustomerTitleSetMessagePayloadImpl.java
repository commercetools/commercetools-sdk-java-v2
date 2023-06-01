package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Set Title update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerTitleSetMessagePayloadImpl implements CustomerTitleSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private String title;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerTitleSetMessagePayloadImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.type =  CUSTOMER_TITLE_SET;
    }
    /**
     * create empty instance
     */
    public CustomerTitleSetMessagePayloadImpl() {
        this.type =  CUSTOMER_TITLE_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     */
    
    public String getTitle(){
        return this.title;
    }

    
    public void setTitle(final String title){
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerTitleSetMessagePayloadImpl that = (CustomerTitleSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(title, that.title)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(title)
            .toHashCode();
    }

}
