package com.transitiontose.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final TextView didY = (TextView) findViewById(R.id.didYou);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // the button was clicked.  update fact label with new fact.

                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones; by the time you are an adult you will have 200.",
                        "It takes about 8 minutes for light from the Sun to reach Earth.",
                        "Some bamboo plants can grow almost a meter in just one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 meters out of the water.",
                        "On average, it takes 56 days to form a new habit.",
                        "Mammoths still walked the earth when the Great Pyramid was being built.",
                        "There are more life forms living in your skin than there are people on the planet.",
                        "Otters sleep holding hands.",
                        "Caterpillars completely liquify as they transform into moths.",
                        "An indoor vegetable factory in Japan produces up to 10,000 heads of lettuce per day and uses 1% of the amount of water needed for outdoor fields.",
                        "When hippos are upset, their sweat turns red.",
                        "“Facebook Addiction Disorder” is a mental disorder identified by Psychologists.",
                        "The average woman uses her height in lipstick every 5 years.",
                        "Human saliva has a boiling point three times that of regular water.",
                        "During your lifetime, you will produce enough saliva to fill two swimming pools.",
                        "Bikinis and tampons were invented by men.",
                        "Heart attacks are more likely to happen on a Monday.",
                        "Camels have three eyelids to protect themselves from blowing sand.",
                        "Dolphins sleep with one eye open.",
                        "Months that begin on a Sunday will always have a ‘Friday the 13th’.",
                        "Fictional/horror writer Stephen King sleeps with a nearby light on to calm his fear of the dark.",
                        "Americans travel 1,144,721,000 miles by air every day.",
                        "38% of American men say they love their cars more than women.",
                        "The U.S. military operates 234 golf courses.",
                        "A cat has 32 muscles in each ear.",
                        "A duck’s quack doesn’t echo, and no one knows why.",
                        "The average lifespan of an eyelash is five months.",
                        "A spider has transparent blood.",
                        "Babies are most likely to be born on Tuesdays.",
                        "The Minneapolis phone book has 21 pages of Andersons.",
                        "A horse can look forward with one eye and back with the other.",
                        "The word Pennsylvania is misspelled on the Liberty Bell.",
                        "You spend 7 years of your life in the bathroom.",
                        "Simplistic passwords contribute to over 80% of all computer password break-ins.",
                        "Dentists have recommended that a toothbrush be kept at least 6 feet away from a toilet to avoid airborne particles resulting from the flush.",
                        "Most dust particles in your house are made from dead skin.",
                        "Venus is the only planet that rotates clockwise.",
                        "Oak trees do not produce acorns until they are fifty years of age or older.",
                        "The king of hearts is the only king without a mustache.",
                        "Thirty-five percent of people who use personal ads for dating are already married.",
                        "One out of 20 people have an extra rib.",
                        "The longest distance a deepwater lobster has been recorded to travel is 225 miles.",
                        "Orcas when traveling in groups, breathe in unison.",
                        "Pucks hit by hockey sticks have reached speeds of up to 150 miles per hour",
                        "Most lipstick contains fish scales.",
                        "No piece of paper can be folded in half more than 7 times.",
                        "More people are killed by donkeys annually than are killed in plane crashes.",
                        "The fear of peanut butter sticking to the roof of the mouth is called Arachibutyrophobia.",
                        "Serving ice cream on cherry pie was once illegal in Kansas.",
                        "Emus cannot walk backwards.",
                        "Infants spend more time dreaming than adults do.",
                        "Over 200 varieties of watermelons are grown in the U.S.",
                        "The most dangerous job in the United States is that of a fisherman, followed by logging and then an airline pilot.",
                        "The youngest pope was 11 years old.",
                        "You share your birthday with at least 9 other million people in the world.",
                        "During the First World War, cigarettes were handed out to soldiers along with their rations.",
                        "The USA bought Alaska from Russia for 2 cents an acre.",
                        "Walmart sells more apparel a year than all the other competing department stores combined.",
                        "Canada has more inland waters and lakes than any other country in the world.",
                        "Ramses II, a pharaoh of Egypt died in 1225 B.C. At the time of his death, he had fathered 96 sons and 60 daughters.",
                        "Women are twice as likely to be diagnosed with depression than men in the United States.",
                        "An average city dog lives approximately three years longer than an average country dog.",
                        "On average, falling asleep while driving results in 550 accidents per day in the United States.",
                        "The average life span of a single red blood cell is 120 days.",
                        "Over 250 million Slinky toys have been sold since its debut in 1946.",
                        "The last thing Elvis Presley ate before he died was four scoops of ice cream and 6 chocolate chip cookies.",
                        "Every year, Burger King restaurants prepare over 950,000 pounds of bacon for their breakfast customers.",
                        "The cosmos is within us, we're made of star stuff.  We are a way for the cosmos to know itself.",
                        "There is a dog museum in St. Louis, Missouri.",
                        "An average person laughs about 15 times a day.",
                        "About 10% of the 100,000 thunderstorms that occur in the USA every year are classified as severe.",
                        "A leech has 32 brains.",
                        "There are about 6,800 languages in the world.",
                        "By walking an extra 20 minutes every day, an average person will burn off seven pounds of body fat in an year.",
                        "A slug has four noses.",
                        "Camel is considered unclean meat in the Bible.",
                        "Mosquitoes have teeth.",
                        "Cats have over one hundred vocal sounds, dogs only have about ten.",
                        "Lions cannot roar until they reach the age of two.",
                        "In Las Vegas, casinos do not have any clocks.",
                };

                String fact = "";

                Random rng = new Random();
                int random = rng.nextInt(facts.length);

                fact = facts[random];
                factLabel.setText(fact);
                didY.setText("Did you know?");
            }
        };
        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}