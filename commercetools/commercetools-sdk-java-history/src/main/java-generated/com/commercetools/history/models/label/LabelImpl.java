package com.commercetools.history.models.label;

import com.commercetools.history.models.label.CustomObjectLabel;
import com.commercetools.history.models.label.CustomerLabel;
import com.commercetools.history.models.label.LocalizedLabel;
import com.commercetools.history.models.label.OrderLabel;
import com.commercetools.history.models.label.PaymentLabel;
import com.commercetools.history.models.label.ProductLabel;
import com.commercetools.history.models.label.QuoteLabel;
import com.commercetools.history.models.label.QuoteRequestLabel;
import com.commercetools.history.models.label.ReviewLabel;
import com.commercetools.history.models.label.StagedQuoteLabel;
import com.commercetools.history.models.label.StringLabel;
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
 *  <p>Provides descriptive information specific to the resource.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LabelImpl implements Label, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LabelImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public LabelImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        LabelImpl that = (LabelImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
