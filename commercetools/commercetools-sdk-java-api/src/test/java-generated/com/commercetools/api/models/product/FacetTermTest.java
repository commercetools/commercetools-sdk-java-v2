
package com.commercetools.api.models.product;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class FacetTermTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(FacetTermBuilder builder) {
        FacetTerm facetTerm = builder.buildUnchecked();
        Assertions.assertThat(facetTerm).isInstanceOf(FacetTerm.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { FacetTerm.builder().term("term") },
                new Object[] { FacetTerm.builder().count(2L) }, new Object[] { FacetTerm.builder().productCount(1L) } };
    }

    @Test
    public void term() {
        FacetTerm value = FacetTerm.of();
        value.setTerm("term");
        Assertions.assertThat(value.getTerm()).isEqualTo("term");
    }

    @Test
    public void count() {
        FacetTerm value = FacetTerm.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void productCount() {
        FacetTerm value = FacetTerm.of();
        value.setProductCount(1L);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1L);
    }
}
