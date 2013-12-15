hk2-spi
=======

Showcase of HK2 relocation and using it for creating an SPI.

Notes:

1. The resources module contains alterned versions of hk2's meta-info files
2. The spi module contains a simple contract interface
3. The impl module generated an uber jar that relocated hk2 and its resources 
and it also contains an implementation of the contract in the spi module.
4. The demo module has a test class that tries to use the relocated version of 
ServiceLocatorUtilities to try and load the contract.



When you try to execute DemoTest case createAndPopulateServiceLocator method throws a NPE because it can not find DynamicConfigurationService.
