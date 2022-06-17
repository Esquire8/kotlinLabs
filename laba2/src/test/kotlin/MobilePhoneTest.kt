import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MobilePhoneTest {

    val mobilePhone = MobilePhone("123")

    @Test
    fun addNewContact() {
        mobilePhone.addNewContact(Contact("test", "321"))
        assertTrue(mobilePhone.myContacts.component1().equals(Contact("test", "321")))
    }

    @Test
    fun updateContact() {
        mobilePhone.addNewContact(Contact("test", "321"))
        mobilePhone.updateContact(Contact("test", "321"), Contact("Test2", "456"))
        assertTrue(mobilePhone.myContacts.component1().equals(Contact("Test2", "456")))
    }

    @Test
    fun removeContact() {
        mobilePhone.addNewContact(Contact("test", "321"))
        mobilePhone.addNewContact(Contact("test2", "654"))
        mobilePhone.removeContact(Contact("test", "321"))
        assertTrue(mobilePhone.myContacts.component1().equals(Contact("test2", "654")))
    }

    @Test
    fun findContact() {
        val testContact = Contact("test", "123")
        mobilePhone.addNewContact(testContact)
        val index = mobilePhone.findContact(testContact)
        assertTrue(mobilePhone.myContacts[index].equals(testContact))
    }
}