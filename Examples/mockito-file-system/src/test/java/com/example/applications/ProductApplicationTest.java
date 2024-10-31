package com.example.applications;

import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductApplicationTest {
    @InjectMocks
    ProductApplication productApplication;

    @Mock
    ProductService productService;

    @BeforeEach
    public void setUp() {

    }

    @DisplayName("Should save image correctly.")
    @Test
    public void shouldSaveImageCorrectly() {
        Mockito.when(productService.save(Mockito.any(Product.class))).thenReturn(true);

        Product product = new Product(1, "A", 10, "X:/");

        productApplication.append(product);

        Mockito.verify(productService, Mockito.times(1)).save(Mockito.any(Product.class));
    }

    @DisplayName("Should remove image correctly.")
    @Test
    public void shouldRemoveImageCorrectly() {
        productApplication.remove(1);

        Mockito.verify(productService, Mockito.times(1)).remove(Mockito.any(Integer.class));
    }

    @DisplayName("Should update image correctly.")
    @Test
    public void shouldUpdateImageCorrectly() {
        Product product = new Product(1, "A", 10, "X:/");

        productApplication.update(1, product);

        Mockito.verify(productService, Mockito.times(1)).update(Mockito.any(Product.class));
    }
}
