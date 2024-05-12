public class BorrowJournal implements BorrowResource{

    @Override
    public void borrowResource(Student student, ResourceDescription resourceDescription) {
        System.out.println("----------------------------------------------------------" + 
        "\n-Borrowed Resources-" +
        "\n\nStudent: " + student.getStudName() + 
        "\nStudent ID: " + student.getStudentId() +
        "\nResourceID: " + resourceDescription.getResourceID() +
        "\ntitle: " + resourceDescription.getTitle() +
        "\nAuthor: " + resourceDescription.getAuthor() +
        "\nResource: " + resourceDescription.getType());        
    }
}