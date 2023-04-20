import java.util.Scanner;

// Student: Rauny Ferreira Martinelli
// Student ID: 101333371
public class MyArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the number of movie reviewers from the user
        System.out.print("Enter the number of movie reviewers: ");
        int numReviewers = scan.nextInt();

        // Get the number of movies from the user
        System.out.print("Enter the number of movies: ");
        int numMovies = scan.nextInt();

        // Create a 2D array to store the movie ratings
        int[][] movieReviews = new int[numReviewers][numMovies];

        // Prompt the user to enter the movie ratings
        System.out.println("Enter the ratings for each movie, row by row, between 1 and 10:");

        // Read in the movie ratings from the user
        for (int i = 0; i < numReviewers; i++) {
            for (int j = 0; j < numMovies; j++) {
                movieReviews[i][j] = scan.nextInt();
            }
        }

        // Print a blank line for spacing
        System.out.println();

        // Create an instance of the MyArrays class
        MyArrays myArrays = new MyArrays();

        // Call the printAverageReviewerRating method to print the average rating for each reviewer
        myArrays.printAverageReviewerRating(movieReviews, numReviewers, numMovies);
    }

    /**
     * Prints the average rating for each reviewer.
     *
     * @param reviews 2D array of movie ratings
     * @param numReviewers number of movie reviewers
     * @param numMovies number of movies
     */
    public void printAverageReviewerRating(int[][] reviews, int numReviewers, int numMovies) {
        for (int i = 0; i < numReviewers; i++) {
            int total = 0;

            // Calculate the total rating for this reviewer
            for (int j = 0; j < numMovies; j++) {
                total += reviews[i][j];
            }

            // Calculate the average rating for this reviewer
            float avgRating = (float) total / numMovies;

            // Print the average rating for this reviewer
            System.out.println("Average rating of reviewer " + (i + 1) + " is " + avgRating);
        }
    }
}
