import random
word_bank = ['science', 'programming', 'design', 'website', 'computer']
word = random.choice(word_bank)
guessedWord = ['_'] * len(word)
attempts = 10

#Game Loop
while attempts > 0:
    while attempts > 0:
        print('\nCurrent word: ' + ' '.join(guessedWord))
        guess = input('Guess a letter: ')
        
        if guess in word:
            for i in range(len(word)):
                if word[i] == guess:
                    guessedWord[i] = guess
                print('Great guess!')
        
        else:   
            attempts -= 10
            print('Wrong guess! Attempts left: ' + str(attempts))
        if '_' not in guessedWord:
                print('\nCongratulations!! You guessed the word: ' + word)
                break
        else:
            print('\nYou\'ve run out of attempts! The word was: ' + word)

#We don't need to break the while loop because the condition was while attempts > 0.
#When you're finished, the game loop should look something like this:
    while attempts > 0:
   
        print('\nCurrent word: ' + ' '.join(guessedWord))

    guess = input('Guess a letter: ').lower()
   
    if guess in word:
        for i in range(len(word)):
            if word[i] == guess:
                guessedWord[i] = guess
        print('Great guess!')
    else:
        attempts -= 1
        print('Wrong guess! Attempts left: ' + str(attempts))
    if '_' not in guessedWord:
        print('\nCongratulations!! You guessed the word: ' + word)
        break
    else:
      print('\nYou\'ve run out of attempts! The word was: ' + word)       