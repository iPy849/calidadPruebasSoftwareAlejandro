package com.anahuac.mockito.intro;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class DependencyTestJunit4 {

    private Dependency dependency;

    @Before
    public void setup() throws Exception{
        dependency = Mockito.mock(Dependency.class);
    }

    @After
    public void tearDown() throws Exception {

    }

    private void setBehavior(){
        when(dependency.getClassName()).thenReturn("Dependency Mock class");
    }

    @Test
    public void test() {
        assertThat(dependency.getClassName(), is(nullValue()));
    }

    @Test
    public void test_with_behavior() {
        setBehavior();
        assertThat(dependency.getClassName(), is("Dependency Mock class"));
    }

    @Test
    public void add_Two_Test(){
        assertThat(dependency.addTwo(1), is(0));
    }

    @Test
    public void add_Two_when_Test(){
        when(dependency.addTwo(anyInt())).thenReturn(2);
        assertThat(dependency.addTwo(anyInt()), is(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_two_exception_Test(){
        when(dependency.addTwo(anyInt())).thenThrow(IllegalArgumentException.class);
        assertThat(dependency.addTwo(1), is(3));
    }

    @Test
    public void add_two_return_Test(){
        when(dependency.addTwo(anyInt())).thenReturn(2);
        assertThat(dependency.addTwo(anyInt()), is(2));
    }


}
